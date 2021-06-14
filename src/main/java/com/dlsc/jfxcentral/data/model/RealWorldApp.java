package com.dlsc.jfxcentral.data.model;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class RealWorldApp extends ModelObject {

    private String name;
    private String summary;
    private String company;
    private String domain;
    private String url;

    private List<String> videoIds = new ArrayList<>();

    public RealWorldApp() {
    }

    @Override
    public boolean matches(String searchPattern) {
        if (tagsMatch(searchPattern)) {
            return true;
        }

        if (StringUtils.containsAnyIgnoreCase(name, searchPattern)) {
            return true;
        }

        if (StringUtils.containsAnyIgnoreCase(summary, searchPattern)) {
            return true;
        }

        if (StringUtils.containsAnyIgnoreCase(company, searchPattern)) {
            return true;
        }

        if (StringUtils.containsAnyIgnoreCase(domain, searchPattern)) {
            return true;
        }

        return false;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<String> getVideoIds() {
        return videoIds;
    }

    public void setVideoIds(List<String> videoIds) {
        this.videoIds = videoIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
