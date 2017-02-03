package com.fpds.esplugins;

import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.inject.assistedinject.Assisted;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.similarity.AbstractSimilarityProvider;

/**
 * Simple {@link SimilarityProvider} for a {@link CustomSimilarity}
 * 
 * @author tlrx
 *
 */
public class CustomSimilarityProvider extends AbstractSimilarityProvider {

	private final CustomSimilarity similarity = new CustomSimilarity();

	@Inject
	public CustomSimilarityProvider(@Assisted String name, @Assisted Settings settings) {
		super(name);
	}

	@Override
	public CustomSimilarity get() {
		return similarity;
	}
}
