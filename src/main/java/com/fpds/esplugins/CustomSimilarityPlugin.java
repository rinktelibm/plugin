package com.fpds.esplugins;

import org.elasticsearch.index.similarity.SimilarityModule;
import org.elasticsearch.plugins.Plugin;

public class CustomSimilarityPlugin extends Plugin {

    @Override
    public String name() {
        return "custom-similarity-plugin";
    }

    @Override
    public String description() {
        return "Custom Similarity Plugin";
    }

    public void onModule(final SimilarityModule module) {
        module.addSimilarity("customsimilarity", CustomSimilarityProvider.class);
    }
}
