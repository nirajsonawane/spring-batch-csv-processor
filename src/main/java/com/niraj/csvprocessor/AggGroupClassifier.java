package com.niraj.csvprocessor;

import org.springframework.batch.support.annotation.Classifier;

public class AggGroupClassifier {

	@Classifier
	public String classify(Person person) {
	    return person.getAgeGroup();
	    		
	}
}
