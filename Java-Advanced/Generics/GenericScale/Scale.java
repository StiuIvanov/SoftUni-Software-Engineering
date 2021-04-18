package GenericScale;

public class Scale <T extends Comparable> {
    public T left;
    public T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier(){
        if (this.left.compareTo(this.right)==0){
            return null;
        }else if (this.left.compareTo(this.right)>0){
            return left;
        }

        return right;
    }

}
