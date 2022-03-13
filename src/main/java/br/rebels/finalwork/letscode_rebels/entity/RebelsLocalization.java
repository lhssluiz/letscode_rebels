package br.rebels.finalwork.letscode_rebels.entity;

import lombok.Data;

@Data
public class RebelsLocalization {
        private Double latitude;
        private Double longitude;

        public RebelsLocalization(Double latitude, Double longitude){

                this.latitude = latitude;
                this.longitude = longitude;

        }
}
