package org.debugroom.mynavi.sample.spring.data.cassandra.domain.service;

import org.debugroom.mynavi.sample.spring.data.cassandra.domain.model.entity.MynaviSampleTable;
import org.debugroom.mynavi.sample.spring.data.cassandra.domain.model.entity.MynaviSampleTableKey;
import org.debugroom.mynavi.sample.spring.data.cassandra.domain.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.plugin.util.UIUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class SampleServiceImpl implements SampleService{

    @Autowired
    SampleRepository sampleRepository;

    @Override
    public MynaviSampleTable getMynaviSampleTable(MynaviSampleTableKey mynaviSampleTableKey) {
        return sampleRepository.findById(mynaviSampleTableKey).get();
    }

    @Override
    public List<MynaviSampleTable> getMynaviSampleTables() {
        List<MynaviSampleTable> mynaviSampleTables = new ArrayList<>();
        sampleRepository.findAll().iterator().forEachRemaining(mynaviSampleTables::add);
        return mynaviSampleTables;
    }

    @Override
    public MynaviSampleTable addMynaviSampleTable(MynaviSampleTable mynaviSampleTable) {
        mynaviSampleTable.setMynaviSampleTableKey(MynaviSampleTableKey.builder()
                .partitionColumn(UUID.randomUUID().toString())
                .clusterColumn("1")
                .build());
        return sampleRepository.save(mynaviSampleTable);
    }

    @Override
    public MynaviSampleTable updateMynaviSampleTable(MynaviSampleTable mynaviSampleTable) {
        return sampleRepository.save(mynaviSampleTable);
    }

    @Override
    public MynaviSampleTable deleteMynaviSampleTable(MynaviSampleTableKey mynaviSampleTableKey) {
        MynaviSampleTable mynaviSampleTable = sampleRepository.findById(mynaviSampleTableKey).get();
        sampleRepository.deleteById(mynaviSampleTableKey);
        return mynaviSampleTable;
    }

}
