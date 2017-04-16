var odd = new List<int> {1, 2, 3}.Where(x => x%2 == 1);
var oddSquares = odd.Select(x => x*x);
var oddCubes = odd.Select(x => x*x*x);
PrintAll(oddSquares);
PrintAll(oddCubes);
