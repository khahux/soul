/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * Contributor license agreements.See the NOTICE file distributed with
 * This work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * he License.You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.dromara.soul.dashboard.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * this is selector view to web front.
 *
 * @author xiaoyu
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SelectorVO implements Serializable {

    /**
     * plugin id.
     */
    private String pluginId;

    /**
     * selector name.
     */
    private String name;

    /**
     * match mode code.
     */
    private Integer matchMode;

    /**
     * match mode name.
     */
    private String matchModeName;

    /**
     * selector type code.
     */
    private Integer type;

    /**
     * selector type name.
     */
    private String typeName;

    /**
     * sort type.
     */
    private Integer sort;

    /**
     * whether enabled.
     */
    private Boolean enabled;

    /**
     * whether loged.
     */
    private Boolean loged;

    /**
     * whether continued.
     */
    private Boolean continued;

    /**
     * the json handle data.
     */
    private String handle;

    /**
     * selector conditions.
     */
    private List<SelectorConditionVO> selectorConditions;
}