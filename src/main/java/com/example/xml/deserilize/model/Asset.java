package com.example.xml.deserilize.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.Data;

import java.util.List;

@Data
public class Asset {

    @JacksonXmlProperty(isAttribute = true, localName = "AssetUniqueID")
    private String assetUniqueID;

    @JacksonXmlProperty(isAttribute = true, localName = "Index")
    private String index;

    @JacksonXmlProperty(isAttribute = true, localName = "Name")
    private String name;

    @JacksonXmlProperty(isAttribute = true, localName = "AssetID")
    private String assetID;

    @JacksonXmlProperty(localName = "Title")
    private String title;

    @JacksonXmlProperty(localName = "Label")
    private String label;

    @JacksonXmlProperty(localName = "ThumbnailImage")
    private String thumbnailImage;

    @JacksonXmlProperty(localName = "PosterImage")
    private String posterImage;

    @JacksonXmlProperty(localName = "Subtitle")
    private String subTitle;

    @JacksonXmlElementWrapper(localName = "LanguageList")
    @JacksonXmlProperty(localName = "Lang")
    private List<String> languageList;

    @JacksonXmlProperty(localName = "URL")
    private URL url;

    @JacksonXmlProperty(localName = "VideoDuration")
    private String videoDuration;
}
