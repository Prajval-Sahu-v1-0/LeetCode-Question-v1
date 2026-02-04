class Solution {
    public int compareVersion(String version1, String version2) {
        String[] part1 = version1.split("\\."), part2 = version2.split("\\.");
        int maxLen = Math.max(part1.length,part2.length);

        for(int i=0;i < maxLen;i++)
        {
            Integer v1 = i < part1.length ? Integer.parseInt(part1[i]) : 0;
            Integer v2 = i < part2.length ? Integer.parseInt(part2[i]) : 0;

            if (v1.compareTo(v2) != 0) return v1.compareTo(v2);

        }return 0;
    }
}