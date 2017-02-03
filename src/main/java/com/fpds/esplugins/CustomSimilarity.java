package com.fpds.esplugins;

import org.apache.lucene.search.similarities.DefaultSimilarity;

/**
 * Custom similarity class
 * 
 */
@SuppressWarnings("serial")
public class CustomSimilarity extends DefaultSimilarity {

	@Override
	public float idf(long docFreq, long numDocs) {
		return 1.0f;
	}
}
