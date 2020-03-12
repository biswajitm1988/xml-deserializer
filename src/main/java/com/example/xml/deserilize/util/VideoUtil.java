package com.example.xml.deserilize.util;

import com.example.xml.deserilize.model.Videos;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.net.URL;

@Slf4j
@Component
public class VideoUtil {

    private String videoXMLURL="http://img1.wynimgqb.com/static/videos/XMLS/rcitv/RCI_Weeks_en_US.xml";

    @SneakyThrows
    public Videos deserialize(){
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        return xmlMapper.readValue(new URL(videoXMLURL), Videos.class);
    }
}
