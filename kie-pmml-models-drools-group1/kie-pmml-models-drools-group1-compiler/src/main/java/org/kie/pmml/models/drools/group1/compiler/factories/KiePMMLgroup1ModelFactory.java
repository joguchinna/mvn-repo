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
package  org.kie.pmml.models.drools.group1.compiler.factories;

import java.util.List;
import java.util.Map;

import org.dmg.pmml.Field;
import org.dmg.pmml.group1.group1Model;
import org.kie.pmml.models.drools.ast.KiePMMLDroolsAST;
import org.kie.pmml.models.drools.ast.KiePMMLDroolsType;
import org.kie.pmml.models.drools.dto.DroolsCompilationDTO;
import org.kie.pmml.models.drools.group1.model.KiePMMLgroup1Model;
import org.kie.pmml.models.drools.tuples.KiePMMLOriginalTypeGeneratedType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Class used to generate <code>KiePMMLgroup1</code> out of a <code>DataDictionary</code> and a <code>group1Model</code>
 */
public class KiePMMLgroup1ModelFactory {

    private static final Logger logger = LoggerFactory.getLogger(KiePMMLgroup1ModelFactory.class.getName());

    private KiePMMLgroup1ModelFactory(){
        // Avoid instantiation
    }

    public static KiePMMLgroup1Model getKiePMMLgroup1Model(final DroolsCompilationDTO<group1Model> compilationDTO) throws IllegalAccessException, InstantiationException {
        logger.trace("getKiePMMLgroup1Model {} {}", compilationDTO.getPackageName(), compilationDTO.getModel());
        // TODO
        throw new UnsupportedOperationException();
    }

    public static Map<String, String> getKiePMMLgroup1ModelSourcesMap(final DroolsCompilationDTO<group1Model> compilationDTO) {
        logger.trace("getKiePMMLgroup1ModelSourcesMap {} {} {}", compilationDTO.getFields(),
                     compilationDTO.getModel(), compilationDTO.getPackageName());
        // TODO
        throw new UnsupportedOperationException();
    }

    public static KiePMMLDroolsAST getKiePMMLDroolsAST(final List<Field<?>> fields,
                                                       final group1Model model,
                                                       final Map<String, KiePMMLOriginalTypeGeneratedType> fieldTypeMap,
                                                       final List<KiePMMLDroolsType> types) {
        // TODO
        throw new UnsupportedOperationException();
    }
}