package AutoTes;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.Test;
import javax.xml.transform.Result;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RunAllTest {

    @Karate.Test
    Karate runPost(){
        return Karate.run("postGetDel").relativeTo(getClass());
    }

//    code jika menjalankan beberapa feature file di dalam satu package

//    @Test
////    void testparallel(){
////            Results results = Runner.path("classpath:AutoTes").parallel(1);
////            assertTrue(results.getFailCount() == 0, results.getErrorMessages());
////
////    }



}
