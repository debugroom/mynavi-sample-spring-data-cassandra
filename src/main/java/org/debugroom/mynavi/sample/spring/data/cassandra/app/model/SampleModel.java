package org.debugroom.mynavi.sample.spring.data.cassandra.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SampleModel implements Serializable {

    private String samplePartitionColumn;
    private String sampleClusterColumn;
    private String sampleText;

}
