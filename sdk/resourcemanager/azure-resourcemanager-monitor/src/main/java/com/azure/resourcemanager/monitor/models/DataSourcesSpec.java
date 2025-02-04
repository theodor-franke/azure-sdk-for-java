// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Specification of data sources that will be collected. */
@Fluent
public class DataSourcesSpec {
    /*
     * The list of performance counter data source configurations.
     */
    @JsonProperty(value = "performanceCounters")
    private List<PerfCounterDataSource> performanceCounters;

    /*
     * The list of Windows Event Log data source configurations.
     */
    @JsonProperty(value = "windowsEventLogs")
    private List<WindowsEventLogDataSource> windowsEventLogs;

    /*
     * The list of Syslog data source configurations.
     */
    @JsonProperty(value = "syslog")
    private List<SyslogDataSource> syslog;

    /*
     * The list of Azure VM extension data source configurations.
     */
    @JsonProperty(value = "extensions")
    private List<ExtensionDataSource> extensions;

    /*
     * The list of Log files source configurations.
     */
    @JsonProperty(value = "logFiles")
    private List<LogFilesDataSource> logFiles;

    /*
     * The list of IIS logs source configurations.
     */
    @JsonProperty(value = "iisLogs")
    private List<IisLogsDataSource> iisLogs;

    /**
     * Get the performanceCounters property: The list of performance counter data source configurations.
     *
     * @return the performanceCounters value.
     */
    public List<PerfCounterDataSource> performanceCounters() {
        return this.performanceCounters;
    }

    /**
     * Set the performanceCounters property: The list of performance counter data source configurations.
     *
     * @param performanceCounters the performanceCounters value to set.
     * @return the DataSourcesSpec object itself.
     */
    public DataSourcesSpec withPerformanceCounters(List<PerfCounterDataSource> performanceCounters) {
        this.performanceCounters = performanceCounters;
        return this;
    }

    /**
     * Get the windowsEventLogs property: The list of Windows Event Log data source configurations.
     *
     * @return the windowsEventLogs value.
     */
    public List<WindowsEventLogDataSource> windowsEventLogs() {
        return this.windowsEventLogs;
    }

    /**
     * Set the windowsEventLogs property: The list of Windows Event Log data source configurations.
     *
     * @param windowsEventLogs the windowsEventLogs value to set.
     * @return the DataSourcesSpec object itself.
     */
    public DataSourcesSpec withWindowsEventLogs(List<WindowsEventLogDataSource> windowsEventLogs) {
        this.windowsEventLogs = windowsEventLogs;
        return this;
    }

    /**
     * Get the syslog property: The list of Syslog data source configurations.
     *
     * @return the syslog value.
     */
    public List<SyslogDataSource> syslog() {
        return this.syslog;
    }

    /**
     * Set the syslog property: The list of Syslog data source configurations.
     *
     * @param syslog the syslog value to set.
     * @return the DataSourcesSpec object itself.
     */
    public DataSourcesSpec withSyslog(List<SyslogDataSource> syslog) {
        this.syslog = syslog;
        return this;
    }

    /**
     * Get the extensions property: The list of Azure VM extension data source configurations.
     *
     * @return the extensions value.
     */
    public List<ExtensionDataSource> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: The list of Azure VM extension data source configurations.
     *
     * @param extensions the extensions value to set.
     * @return the DataSourcesSpec object itself.
     */
    public DataSourcesSpec withExtensions(List<ExtensionDataSource> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get the logFiles property: The list of Log files source configurations.
     *
     * @return the logFiles value.
     */
    public List<LogFilesDataSource> logFiles() {
        return this.logFiles;
    }

    /**
     * Set the logFiles property: The list of Log files source configurations.
     *
     * @param logFiles the logFiles value to set.
     * @return the DataSourcesSpec object itself.
     */
    public DataSourcesSpec withLogFiles(List<LogFilesDataSource> logFiles) {
        this.logFiles = logFiles;
        return this;
    }

    /**
     * Get the iisLogs property: The list of IIS logs source configurations.
     *
     * @return the iisLogs value.
     */
    public List<IisLogsDataSource> iisLogs() {
        return this.iisLogs;
    }

    /**
     * Set the iisLogs property: The list of IIS logs source configurations.
     *
     * @param iisLogs the iisLogs value to set.
     * @return the DataSourcesSpec object itself.
     */
    public DataSourcesSpec withIisLogs(List<IisLogsDataSource> iisLogs) {
        this.iisLogs = iisLogs;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (performanceCounters() != null) {
            performanceCounters().forEach(e -> e.validate());
        }
        if (windowsEventLogs() != null) {
            windowsEventLogs().forEach(e -> e.validate());
        }
        if (syslog() != null) {
            syslog().forEach(e -> e.validate());
        }
        if (extensions() != null) {
            extensions().forEach(e -> e.validate());
        }
        if (logFiles() != null) {
            logFiles().forEach(e -> e.validate());
        }
        if (iisLogs() != null) {
            iisLogs().forEach(e -> e.validate());
        }
    }
}
