package org.debugroom.mynavi.sample.spring.data.cassandra.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@PrimaryKeyClass
public class MynaviSampleTableKey implements Serializable {

    @PrimaryKeyColumn(name="partition_column", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String partitionColumn;
    @PrimaryKeyColumn(name="cluster_column", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
    private String clusterColumn;

}
