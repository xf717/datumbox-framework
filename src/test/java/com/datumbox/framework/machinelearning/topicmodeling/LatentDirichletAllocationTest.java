/* 
 * Copyright (C) 2013-2015 Vasilis Vryniotis <bbriniotis at datumbox.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.datumbox.framework.machinelearning.topicmodeling;

import com.datumbox.common.dataobjects.Dataset;
import com.datumbox.common.dataobjects.Record;
import com.datumbox.common.persistentstorage.inmemory.InMemoryConfiguration;
import com.datumbox.common.utilities.RandomValue;
import com.datumbox.configuration.TestConfiguration;
import com.datumbox.framework.machinelearning.classification.SoftMaxRegression;
import com.datumbox.framework.machinelearning.common.bases.mlmodels.BaseMLclassifier;
import com.datumbox.framework.utilities.dataset.DatasetBuilder;
import com.datumbox.framework.utilities.text.extractors.UniqueWordSequenceExtractor;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vasilis Vryniotis <bbriniotis at datumbox.com>
 */
public class LatentDirichletAllocationTest {
    
    public LatentDirichletAllocationTest() {
    }


    /**
     * Test of predict method, of class NLMS.
     */
    @Test
    public void testPredict() throws URISyntaxException {
        System.out.println("predict");
        //TODO: change the test so that it does not require reading from local file
        /*
        RandomValue.randomGenerator = new Random(42);
        
        
        String dbName = "JUnitTopicSelection";

        
        Map<Object, URI> dataset = new HashMap<>();

        dataset.put("negative", new URI("file:///home/bbriniotis/test.neg"));
        dataset.put("positive", new URI("file:///home/bbriniotis/test.pos"));
        
        UniqueWordSequenceExtractor wsExtractor = new UniqueWordSequenceExtractor();
        wsExtractor.setParameters(new UniqueWordSequenceExtractor.Parameters());
        Dataset trainingData =DatasetBuilder.parseFromTextFiles(dataset, wsExtractor);
        
        
        LatentDirichletAllocation lda = new LatentDirichletAllocation(dbName, TestConfiguration.getDBConfig());
        
        LatentDirichletAllocation.TrainingParameters trainingParameters = new LatentDirichletAllocation.TrainingParameters();
        trainingParameters.setMaxIterations(15);
        trainingParameters.setAlpha(0.01);
        trainingParameters.setBeta(0.01);
        trainingParameters.setK(25);        
        
        lda.initializeTrainingConfiguration(trainingParameters);
        lda.train(trainingData, new Dataset());
        
        lda.predict(trainingData);
        
        Dataset reducedTrainingData = new Dataset();
        for(Record r : trainingData) {
            //take the topic assignments and convert them into a new Record
            Record newRecord = new Record();
            newRecord.setX(r.getYPredictedProbabilities());
            newRecord.setY(r.getY());
            
            reducedTrainingData.add(newRecord);
        }
        
        SoftMaxRegression smr = new SoftMaxRegression(dbName, TestConfiguration.getDBConfig());
        SoftMaxRegression.TrainingParameters tp = new SoftMaxRegression.TrainingParameters();
        tp.setLearningRate(1.0);
        tp.setTotalIterations(50);
        
        smr.initializeTrainingConfiguration(tp);
        BaseMLclassifier.ValidationMetrics vm = smr.kFoldCrossValidation(reducedTrainingData, 1);
        
        double expResult = 0.6849291090495362;
        double result = vm.getMacroF1();
        assertEquals(expResult, result, TestConfiguration.DOUBLE_ACCURACY_MEDIUM);

        smr.erase();
        lda.erase();
        */
    }

    
}
