package com.ataulm.vubox;

class Id {

    private static final Id UNKNOWN = new Id("");

    private final String id;

    public static Id from(String id) {
        if (id == null || id.trim().length() == 0) {
            return UNKNOWN;
        }
        return new Id(id.trim());
    }

    Id(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Id id1 = (Id) o;

        return id.equals(id1.id);
    }

}
