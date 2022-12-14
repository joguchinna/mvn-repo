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

import java.util.List;
import java.util.Map;

import org.dmg.pmml.Field;
import org.dmg.pmml.group1.group1Model;
import org.kie.pmml.api.enums.PMML_MODEL;
import org.kie.pmml.api.exceptions.KiePMMLException;
import org.kie.pmml.models.drools.ast.KiePMMLDroolsAST;
import org.kie.pmml.models.drools.ast.KiePMMLDroolsType;
import org.kie.pmml.models.drools.dto.DroolsCompilationDTO;
import org.kie.pmml.models.drools.provider.DroolsModelProvider;
import org.kie.pmml.models.drools.group1.compiler.factories.KiePMMLgroup1ModelFactory;
import org.kie.pmml.models.drools.group1.model.KiePMMLgroup1Model;
import org.kie.pmml.models.drools.tuples.KiePMMLOriginalTypeGeneratedType;

import static org.kie.pmml.models.drools.group1.model.KiePMMLgroup1Model.PMML_MODEL_TYPE;

/**
 * Default <code>DroolsModelProvider</code> for <b>group1</b>
 */
public class group1ModelImplementationProvider extends DroolsModelProvider<group1Model,KiePMMLgroup1Model>{

    @Override
    public PMML_MODEL getPMMLModelType() {
        return PMML_MODEL_TYPE;
    }

    @Override
    public KiePMMLgroup1Model getKiePMMLDroolsModel(final DroolsCompilationDTO<group1Model> compilationDTO) {
        try {
            return KiePMMLgroup1ModelFactory.getKiePMMLgroup1Model(compilationDTO);
        } catch (IllegalAccessException | InstantiationException e) {
            throw new KiePMMLException(e.getMessage(), e);
        }
    }

    @Override
    public KiePMMLDroolsAST getKiePMMLDroolsAST(final List<Field<?>> fields,
                                                final group1Model model,
                                                final Map<String, KiePMMLOriginalTypeGeneratedType> fieldTypeMap,
                                                final List<KiePMMLDroolsType> types) {
        return KiePMMLgroup1ModelFactory.getKiePMMLDroolsAST(fields, model, fieldTypeMap, types);
    }

    @Override
    public Map<String, String> getKiePMMLDroolsModelSourcesMap(final DroolsCompilationDTO<group1Model> compilationDTO) {
        return KiePMMLgroup1ModelFactory.getKiePMMLgroup1ModelSourcesMap(compilationDTO);
    }
}
