import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SalesItemTest.
 *
 * @author  mik
 * @version 0.1
 */
public class SalesItemTest
{
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain surgery for Dummies", 21998);
        assertEquals(true, salesIte1.addComment("James Duckling", "This book is great. I perform brain surgery every week now.", 4));
        assertEquals(1, salesIte1.getNumberOfComments());
    }

    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        SalesItem salesIte1 = new SalesItem("Java For Complete Idiots, Vol 2", 19900);
        assertEquals(false, salesIte1.addComment("Joshua Black", "Not worth the money. The font is too small.", -5));
    }

    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        SalesItem salesIte1 = new SalesItem("test name", 1000);
        assertEquals("test name", salesIte1.getName());
        assertEquals(1000, salesIte1.getPrice());
    }

    @Test
    public void addComment()
    {
        SalesItem salesIte1 = new SalesItem("Brain Surgery for Dummies.", 9899);
        assertEquals(true, salesIte1.addComment("Fred", "Great - I perform brain surgery every week now!", 4));
    }

    @Test
    public void commentTest()
    {
    }

    @Test
    public void comment()
    {
    }

    @Test
    public void addcommentTest()
    {
        SalesItem salesIte2 = new SalesItem("candy", 50);
        salesIte2.addComment("karol", "I love this", 5);
        salesIte2.addComment("karol", "I love this", 5);
    }

    @Test
    public void boundaryTest()
    {
        SalesItem salesIte1 = new SalesItem("candy", 50);
        assertEquals(false, salesIte1.addComment("karol", "I love this", 0));
        salesIte1.addComment("Jules", "I love this", 6);
    }

    @Test
    public void findMostHelpfulComment()
    {
        SalesItem salesIte1 = new SalesItem("lollipop", 50);
        salesIte1.addComment("caleb", "very good", 5);
        salesIte1.addComment("me", "good but could be better", 3);
        salesIte1.findMostHelpfulComment();
        salesIte1.upvoteComment(1);
        salesIte1.downvoteComment(0);
        Comment comment1 = salesIte1.findMostHelpfulComment();
        assertEquals("me", comment1.getAuthor());
        assertEquals(1,comment1.getVoteCount());
    }
}











