package com.agi.automation;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EvidenceHandler {
    private final Map<String, String> evidences;

    public EvidenceHandler() {
        this.evidences = new TreeMap<>();
    }

    public Map<String, String> getEvidences() {
        return evidences;
    }

    public void addEvidence(String key, String value) {
        this.evidences.put(key, value);
    }
}
