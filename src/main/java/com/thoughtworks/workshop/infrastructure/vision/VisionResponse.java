package com.thoughtworks.workshop.infrastructure.vision;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class VisionResponse {

    public List<Response> responses;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Response {

        public List<FaceAnnotation> faceAnnotations;

        @JsonIgnoreProperties(ignoreUnknown = true)
        public static class FaceAnnotation {

            public BoundingPoly boundingPoly;
            public BoundingPoly fdBoundingPoly;
            public List<Landmark> landmarks;
            public String rollAngle;
            public String panAngle;
            public String tiltAngle;
            public String detectionConfidence;
            public String landmarkingConfidence;
            public String joyLikelihood;
            public String sorrowLikelihood;
            public String angerLikelihood;
            public String surpriseLikelihood;
            public String underExposedLikelihood;
            public String blurredLikelihood;
            public String headwearLikelihood;

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class BoundingPoly {

                public List<Vertex> vertices;
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Vertex {

                public String x;
                public String y;
            }

            @JsonIgnoreProperties(ignoreUnknown = true)
            public static class Landmark {

                public String type;
                public Position position;

                @JsonIgnoreProperties(ignoreUnknown = true)
                public static class Position {

                    public String x;
                    public String y;
                    public String z;
                }
            }
        }
    }
}
