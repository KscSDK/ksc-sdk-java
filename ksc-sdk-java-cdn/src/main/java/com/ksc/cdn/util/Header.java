package com.ksc.cdn.util;

/**
 * Represents a HTTP header
 */
public class Header {

    private final String name;
    private final String value;

    /**
     * Create a new header with the given name and value.
     *
     * @param name  The header name, cannot be null.
     * @param value The value (can be null)
     */
    public Header(String name, String value) {
        if (name == null) {
            throw new IllegalArgumentException("Header name cannot be null");
        }

        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public boolean hasSameNameAs(Header header) {
        if (header == null) {
            throw new IllegalArgumentException("header cannot be null");
        }

        return this.name.equalsIgnoreCase(header.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Header header = (Header) o;

        if (name != null ? !name.equals(header.name) : header.name != null)
            return false;
        if (value != null ? !value.equals(header.value) : header.value != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(name);
        if (value != null) {
            builder.append("=").append(value);
        }
        return builder.toString();
    }
}