package com.lacunasoftware.restpki;

import java.security.InvalidParameterException;

class Version {

    private String versionStr;
    private int[] versionArr;

    Version(String versionStr) {

        if (versionStr == null || versionStr.length() <= 0) {
            throw new InvalidParameterException("Invalid string version.");
        }
        this.versionStr = versionStr;

        String[] versions = versionStr.split(".");
        versionArr = new int[versions.length];
        for (int i = 0; i < versions.length; i++) {
            versionArr[i] = Integer.parseInt(versions[i]);
        }
    }

    boolean isLessThanOrEqualTo(Version otherVersion) {

        int compResult = CompareElementsBasedOnThisInstance(otherVersion);
        return compResult <= 0;
    }

    boolean isLessThan(Version otherVersion) {

        int compResult = CompareElementsBasedOnThisInstance(otherVersion);
        return compResult == -1;
    }

    boolean isEqualTo(Version otherVersion) {

        int compResult = CompareElementsBasedOnThisInstance(otherVersion);
        return compResult == 0;
    }

    boolean isGreaterThan(Version otherVersion) {

        int compResult = CompareElementsBasedOnThisInstance(otherVersion);
        return compResult == 1;
    }

    boolean isGreaterThanOrEqualTo(Version otherVersion) {

        int compResult = CompareElementsBasedOnThisInstance(otherVersion);
        return compResult >= 0;
    }

    private int CompareElementsBasedOnThisInstance(Version otherVersion) {

        try {
            for (int i = 0; i < versionArr.length; i++) {

                if (i >= otherVersion.getVersionArr().length) {
                    return 1;
                }

                if (versionArr[i] < otherVersion.getVersionArr()[i]) {
                    return -1;
                } else if (versionArr[i] > otherVersion.getVersionArr()[i])  {
                    return 1;
                }
            }

            if (versionArr.length < otherVersion.getVersionArr().length) {
                return -1;
            } else {
                return 0;
            }
        } catch(Exception ex) {
            throw new RuntimeException("Invalid object provided as parameter");
        }
    }

    String getVersionStr() {
        return versionStr;
    }

    int[] getVersionArr() {
        return versionArr;
    }
}
