package com.linkedin.learning.model;

class Self {
    private String ref;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    @Override
    public String toString() {
        return "Self{" +
                "ref='" + ref + '\'' +
                '}';
    }
}