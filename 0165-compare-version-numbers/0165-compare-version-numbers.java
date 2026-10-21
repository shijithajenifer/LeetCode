class Solution {
    public int compareVersion(String version1, String version2) {

        String[] a = version1.split("\\.");
        String[] b = version2.split("\\.");

        int i = 0, j = 0;

        while (i < a.length || j < b.length) {
            int x = i < a.length ? Integer.parseInt(a[i]) : 0;
            int y = j < b.length ? Integer.parseInt(b[j]) : 0;

            if (x < y) return -1;
            if (x > y) return 1;

            i++;
            j++;
        }

        return 0;
    }
}
