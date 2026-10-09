class Solution {
    public int dayOfYear(String date) {
        return java.time.LocalDate.parse(date).getDayOfYear();
    }
}