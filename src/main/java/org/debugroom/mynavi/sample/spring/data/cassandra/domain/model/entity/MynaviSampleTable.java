package org.debugroom.mynavi.sample.spring.data.cassandra.domain.model.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table("mynavi_sample_table")
public class MynaviSampleTable implements Serializable {

    @PrimaryKey("mynaviSampleTableKey")
    private MynaviSampleTableKey mynaviSampleTableKey;

    @Column("sample_text")
    private String sampleText;

}
