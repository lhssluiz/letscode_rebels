package br.rebels.finalwork.letscode_rebels.entity;

import lombok.Data;

@Data
public class RebelsLocalization {
        private Double latitude;
        private Double longitude;
        private String nomeGalaxia;

        public RebelsLocalization(Double latitude, Double longitude, String nomeGalaxia) {
                this.latitude = latitude;
                this.longitude = longitude;
                this.nomeGalaxia = nomeGalaxia;

        }
}
