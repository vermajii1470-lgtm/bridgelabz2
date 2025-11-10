public class Q11_ProductReviewSystem {
    static class InvalidRatingException extends Exception { public InvalidRatingException(String m){ super(m);} }
    static class EmptyReviewException extends Exception { public EmptyReviewException(String m){ super(m);} }

    static void submitReview(int rating, String comment) throws InvalidRatingException, EmptyReviewException {
        if(rating < 1 || rating > 5) throw new InvalidRatingException("Rating must be between 1 and 5.");
        if(comment == null || comment.trim().isEmpty()) throw new EmptyReviewException("Review comment cannot be empty.");
        System.out.println("Review submitted: rating=" + rating + ", comment='" + comment + "'");
    }

    public static void main(String[] args) {
        try {
            submitReview(6, "");
        } catch (InvalidRatingException e) {
            System.out.println("Invalid rating: " + e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println("Empty review: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Other error: " + e.getMessage());
        }
    }
}
