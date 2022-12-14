/*
 * Copyright 2022 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.pmml.models.drools.group1.compiler.executor;

import org.kie.pmml.api.enums.PMML_MODEL;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class group1ModelImplementationProviderTest {

    private static final group1ModelImplementationProvider PROVIDER= new group1ModelImplementationProvider();

    @Test
    public void getPMMLModelType(){
    	assertThat(PROVIDER.getPMMLModelType()).isEqualTo(PMML_MODEL.GROUP1_MODEL);
    }

    @Test
    public void getKiePMMLModel() throws Exception {
        // TODO
        throw new UnsupportedOperationException();
    }

    @Test
    public void getKiePMMLModelWithSources() throws Exception {
        // TODO
        throw new UnsupportedOperationException();
    }
}