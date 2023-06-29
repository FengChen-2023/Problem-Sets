class Solution
{
    public List<Boolean> kidsWithCandies( int[] candies, int extraCandies )
    {
        int max = IntStream.of( candies ).max().orElse( 0 );

        return IntStream.of( candies ).mapToObj( c -> c + extraCandies >= max ).collect( Collectors.toList() );
    }
}
