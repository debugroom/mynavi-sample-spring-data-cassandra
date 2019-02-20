package org.debugroom.mynavi.sample.spring.data.cassandra.domain.service;

import org.debugroom.mynavi.sample.spring.data.cassandra.domain.model.entity.MynaviSampleTable;
import org.debugroom.mynavi.sample.spring.data.cassandra.domain.model.entity.MynaviSampleTableKey;

import java.util.List;

public interface SampleService {

    public MynaviSampleTable getMynaviSampleTable(MynaviSampleTableKey mynaviSampleTableKey);
    public List<MynaviSampleTable> getMynaviSampleTables();
    public MynaviSampleTable addMynaviSampleTable(MynaviSampleTable mynaviSampleTable);
    public MynaviSampleTable updateMynaviSampleTable(MynaviSampleTable mynaviSampleTable);
    public MynaviSampleTable deleteMynaviSampleTable(MynaviSampleTableKey mynaviSampleTableKey);

}
