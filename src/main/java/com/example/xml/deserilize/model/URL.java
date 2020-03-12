package com.example.xml.deserilize.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "URL")
public class URL {

    @JacksonXmlProperty(localName = "SrcFlash")
    private String srcFlash;

    @JacksonXmlProperty(localName = "SrcHTML5")
    private String srcHTML5;

    @JacksonXmlProperty(localName = "SrcMP4URL")
    private String srcMP4URL;
}
