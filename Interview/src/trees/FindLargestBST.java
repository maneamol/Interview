package trees;

class MinMax{
    int min;
    int max;
    boolean isBST;
    int size ;
    
    MinMax(){
        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        isBST = true;
        size = 0;
    }
}

public class FindLargestBST {
	public static void main(String[] args) {
		FindLargestBST findLargestBST = new FindLargestBST();
		MinMax m = findLargestBST.findLargestBST(new CreateTree().createTree());
		System.out.println(m.size);
	}
	
	MinMax findLargestBST(Node root) {
		if (root == null) {
			return new MinMax();
		}
		
		MinMax leftMinMax = findLargestBST(root.left);
		MinMax rightMinMax = findLargestBST(root.right);
		
		MinMax minMax = new MinMax();
		
		if (leftMinMax.isBST == false || 
			rightMinMax.isBST == false ||
			(leftMinMax.max > root.data || rightMinMax.min <= root.data)) {
			minMax.isBST = false;
			minMax.size = Math.max(leftMinMax.size, rightMinMax.size);
			return minMax;
		}
		
		minMax.isBST = true;
		minMax.size = (leftMinMax.size + rightMinMax.size + 1);
		
		minMax.min = (root.left != null ? leftMinMax.min : root.data); 
		minMax.max = (root.right != null ? rightMinMax.max : root.data);
		return minMax;
	}
}
