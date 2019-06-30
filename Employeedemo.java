package json;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.;
import java.io.;
import java.nio.*;
import com.fasterxml.jackson.annotations.;
import com.fasterxml.jackson.core.;
import com.fasterxml.jackson.databind.*;

public class Employeedemo {
public static void main(String[] args)
{
Pattern pattern = Pattern.compile(,);
String csvFile=src/us-500.csv;
try(BufferedReader in = new BufferedReader(new FileReader(csvFile));)
{
List<Employee> emp = in.lines().skip(1).map(line -> {
String[] x = pattern.split(line);
return new Employee(x[0],x[1],x[2],x[3],x[4],x[5],x[6],x[7],x[8],x[9],x[10],x[11]);
})
.collect(Collectors.toList());
replaceAll(",","_");
ObjectMapper mapper = new ObjectMapper();
mapper.enable(SerializationFeature.INDENT_OUTPUT);
mapper.writeValue(System.out, emp);
}

    catch(JsonGenerationException e){
        //System.out.println("End");
    e.printStackTrace();
    }

    catch(JsonMappingException e){
        //System.out.println("End");
    e.printStackTrace();
    }

    catch(IOException e){
        //System.out.println("End");
    e.printStackTrace();
    }

    }


}
