// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.util.polling;

import java.time.Duration;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * A type that offers API that simplifies the task of executing long-running operations against
 * an Azure service.
 *
 * <p>
 * It provides the following functionality:
 * <ul>
 *      <li>Querying the current state of the long-running operation.</li>
 *      <li>Requesting cancellation of long-running operation, if supported by the service.</li>
 *      <li>Fetching final result of long-running operation, if supported by the service.</li>
 *      <li>Wait for long-running operation to complete, with optional timeout.</li>
 *      <li>Wait for long-running operation to reach a specific state.</li>
 * </ul>
 *
 * @param <T> The type of poll response value.
 * @param <U> The type of the final result of long-running operation.
 */
public interface SyncPoller<T, U> {
    /**
     * Poll once and return the poll response received.
     *
     * @return the poll response
     */
    PollResponse<T> poll();

    /**
     * Wait for polling to complete. The polling is considered complete based on status defined in
     * {@link LongRunningOperationStatus}.
     *
     * @return the final poll response
     */
    PollResponse<T> waitForCompletion();

    /**
     * Wait for polling to complete with a timeout. The polling is considered complete based on
     * status defined in {@link LongRunningOperationStatus}.
     *
     * @param timeout the duration to waits for polling completion.
     * @return the final poll response.
     */
    PollResponse<T> waitForCompletion(Duration timeout);

    /**
     * Wait for the given {@link LongRunningOperationStatus} to receive.
     *
     * @param statusToWaitFor the desired {@link LongRunningOperationStatus} to block for.
     * @return {@link PollResponse} whose {@link PollResponse#getStatus()} matches {@code statusToWaitFor}.
     * @throws IllegalArgumentException if {@code statusToWaitFor} is {@code null}.
     */
    PollResponse<T> waitUntil(LongRunningOperationStatus statusToWaitFor);

    /**
     * Wait for the given {@link LongRunningOperationStatus}.
     *
     * @param timeout the duration to waits for the polling.
     * @param statusToWaitFor the desired {@link LongRunningOperationStatus} to block for.
     * @return {@link PollResponse} whose {@link PollResponse#getStatus()} matches {@code statusToWaitFor}.
     * @throws IllegalArgumentException if {@code statusToWaitFor} is or {@code timeout} {@code null}.
     */
    PollResponse<T> waitUntil(Duration timeout, LongRunningOperationStatus statusToWaitFor);

    /**
     * Retrieve the final result of the long running operation.
     *
     * @return the final result of the long-running operation if there is one.
     */
    U getFinalResult();

    /**
     * cancels the remote long-running operation if cancellation is supported by the service.
     */
    void cancelOperation();

    /**
     * Sets the poll interval for this poller. The new interval will be used for all subsequent polling operations
     * including the polling operations that are already in progress.
     *
     * @param pollInterval The new poll interval for this poller.
     * @return The updated instance of {@link SyncPoller}.
     * @throws NullPointerException if the {@code pollInterval} is null.
     * @throws IllegalArgumentException if the {@code pollInterval} is zero or negative.
     */
    default SyncPoller<T, U> setPollInterval(Duration pollInterval) {
        // This method is made default to prevent breaking change to the interface.
        // no-op
        return this;
    }

    /**
     * Creates default SyncPoller.
     *
     * @param pollInterval the polling interval.
     * @param syncActivationOperation the operation to synchronously activate (start) the long running operation,
     *     this operation will be called with a new {@link PollingContext}.
     * @param pollOperation the operation to poll the current state of long running operation, this parameter
     *     is required and the operation will be called with current {@link PollingContext}.
     * @param cancelOperation a {@link Function} that represents the operation to cancel the long running operation
     *     if service supports cancellation, this parameter is required and if service does not support cancellation
     *     then the implementer should return Mono.error with an error message indicating absence of cancellation
     *     support, the operation will be called with current {@link PollingContext}.
     * @param fetchResultOperation a {@link Function} that represents the  operation to retrieve final result of
     *     the long running operation if service support it, this parameter is required and operation will be called
     *     current {@link PollingContext}, if service does not have an api to fetch final result and if final result
     *     is same as final poll response value then implementer can choose to simply return value from provided
     *     final poll response.
     *
     * @param <T> The type of poll response value.
     * @param <U> The type of the final result of long-running operation.
     *
     * @return new {@link SyncPoller} instance.
     */
    @SuppressWarnings("unchecked")
    static <T, U> SyncPoller<T, U> createPoller(Duration pollInterval,
        Function<PollingContext<T>, PollResponse<T>> syncActivationOperation,
        Function<PollingContext<T>, PollResponse<T>> pollOperation,
        BiFunction<PollingContext<T>, PollResponse<T>, T> cancelOperation,
        Function<PollingContext<T>, U> fetchResultOperation) {
        return new SimpleSyncPoller<>(pollInterval, syncActivationOperation, pollOperation, cancelOperation,
            fetchResultOperation);
    }
}
