import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ParentTest {
    @Test
    void shouldReturnStringWhenParentContainsToString() {
        Parent ali = new Parent("Alice", "Washington");
        String actual = "[Name: Alice, Place: Washington]";

        assertThat(ali, hasToString(actual));
    }

    @Test
    void shouldPassWhenDaughterIsInheritedFromParent() {

        assertThat(Daughter.class, typeCompatibleWith(Parent.class));
    }

    @Test
    void ShouldPassWhenInstanceOfParent() {
        Parent daisy = new Parent("Daisy", "New York");

        assertThat(daisy, describedAs("Daisy must be instance of Parent", instanceOf(Parent.class)));
    }

    @Test
    void shouldPassWhenInstanceOfDaughter() {
        Daughter zuhi = new Daughter("Zuhi", "Bangalore", true);

        assertThat(zuhi, isA(Daughter.class));
    }

    @Test
    void shouldPassWhenNotSameInstances() {
        Parent shobha = new Parent("Shobha", "Mumbai");
        Parent shilpi = new Parent("Shilpi", "Mumbai");

        assertThat(shobha, not(sameInstance(shilpi)));
    }

}
