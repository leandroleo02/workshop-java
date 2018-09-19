package com.thoughtworks.workshop.infrastructure.vision;

import java.util.List;

public class VisionRequest {

    public List<Request> requests;

    public static class Request {

        public Image image;
        public List<Feature> features;

        public static class Image {

            public String content;
            public Source source;

            public static class Source {

                public String gcsImageUri;
                public String imageUri;
            }
        }

        public static class Feature {

            public String type;
        }
    }
}
