package org.debugroom.mynavi.sample.spring.data.cassandra.domain.repository;

import org.springframework.data.repository.CrudRepository;

import org.debugroom.mynavi.sample.spring.data.cassandra.domain.model.entity.MynaviSampleTable;
import org.debugroom.mynavi.sample.spring.data.cassandra.domain.model.entity.MynaviSampleTableKey;

public interface SampleRepository extends CrudRepository<MynaviSampleTable, MynaviSampleTableKey>{
}
