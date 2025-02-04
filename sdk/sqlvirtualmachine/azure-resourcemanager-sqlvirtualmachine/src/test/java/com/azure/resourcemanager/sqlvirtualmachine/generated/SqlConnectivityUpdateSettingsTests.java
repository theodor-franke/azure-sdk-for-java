// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sqlvirtualmachine.models.ConnectivityType;
import com.azure.resourcemanager.sqlvirtualmachine.models.SqlConnectivityUpdateSettings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SqlConnectivityUpdateSettingsTests {
    @Test
    public void testDeserialize() {
        SqlConnectivityUpdateSettings model =
            BinaryData
                .fromString(
                    "{\"connectivityType\":\"PRIVATE\",\"port\":639676552,\"sqlAuthUpdateUserName\":\"fbebrjcxer\",\"sqlAuthUpdatePassword\":\"wutttxfvjrbi\"}")
                .toObject(SqlConnectivityUpdateSettings.class);
        Assertions.assertEquals(ConnectivityType.PRIVATE, model.connectivityType());
        Assertions.assertEquals(639676552, model.port());
        Assertions.assertEquals("fbebrjcxer", model.sqlAuthUpdateUsername());
        Assertions.assertEquals("wutttxfvjrbi", model.sqlAuthUpdatePassword());
    }

    @Test
    public void testSerialize() {
        SqlConnectivityUpdateSettings model =
            new SqlConnectivityUpdateSettings()
                .withConnectivityType(ConnectivityType.PRIVATE)
                .withPort(639676552)
                .withSqlAuthUpdateUsername("fbebrjcxer")
                .withSqlAuthUpdatePassword("wutttxfvjrbi");
        model = BinaryData.fromObject(model).toObject(SqlConnectivityUpdateSettings.class);
        Assertions.assertEquals(ConnectivityType.PRIVATE, model.connectivityType());
        Assertions.assertEquals(639676552, model.port());
        Assertions.assertEquals("fbebrjcxer", model.sqlAuthUpdateUsername());
        Assertions.assertEquals("wutttxfvjrbi", model.sqlAuthUpdatePassword());
    }
}
