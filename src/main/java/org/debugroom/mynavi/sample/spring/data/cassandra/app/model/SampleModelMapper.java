package org.debugroom.mynavi.sample.spring.data.cassandra.app.model;

import org.debugroom.mynavi.sample.spring.data.cassandra.domain.model.entity.MynaviSampleTable;
import org.debugroom.mynavi.sample.spring.data.cassandra.domain.model.entity.MynaviSampleTableKey;

public interface SampleModelMapper {

    public static MynaviSampleTable map(SampleModel sampleModel){
        return MynaviSampleTable.builder()
                .mynaviSampleTableKey(MynaviSampleTableKey.builder()
                    .partitionColumn(sampleModel.getSamplePartitionColumn())
                    .clusterColumn(sampleModel.getSampleClusterColumn()).build())
                .sampleText(sampleModel.getSampleText())
                .build();
    }

    public static MynaviSampleTableKey mapToMynaviSampleTableKey(SampleModel sampleModel){
        return MynaviSampleTableKey.builder()
                .partitionColumn(sampleModel.getSamplePartitionColumn())
                .clusterColumn(sampleModel.getSampleClusterColumn())
                .build();
    }

}
