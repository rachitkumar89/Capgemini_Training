package streamapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamapi {
    public static void main (String [] args){
        //List<String > immutableList= Stream.of("red","green",null,null).toList();
        //System.out.println(immutableList);
        //immutableList.add("yellow");

        List<String >mutalblelist= Stream.of("Red","yellow",null,null).collect(Collectors.toList());
        System.out.println(mutalblelist);
        mutalblelist.add("orange");
        mutalblelist.set(2,"yellow");
        System.out.println(mutalblelist);

        record Product(String name,String category,int price){
        }
            Stream<Product>  product=Stream.of(new Product("bat","sportsitem",4000),
        new Product("bells","sports",500),
                new Product("mobile","item",20000),
                    new Product("cell phone","item",15000));

//        //Map<String ,List<Product>> cateogryMap=product.collect(Collectors.groupingBy(Product::category));
//        System.out.println(cateogryMap);

//            Map<String,Integer> pricing = product.collect(Collectors.groupingBy(Product::category, Collectors.summingInt(Product::price)));
//        System.out.println(pricing);;
//        Map<String,Double>  avg=product.collect(Collectors.groupingBy(Product::category,Collectors.averagingInt(Product::price)));
//        System.out.println(avg);
//
//        List<Product> filtered = product.filter(Product->Product.price>1500).collect(Collectors.toList());
//        System.out.println(filtered);

         // Mapping extractacting product field;
//        var extractfiels=product.map(Product::price).toList();
//        System.out.println(extractfiels);

        //Partition based on condition
//        Map<Boolean,List<Product>> part=product.collect(Collectors.partitioningBy(Product->Product.price>1000));
//        System.out.println(part);

        // summarizing every thing using summarizingInt it will give count, max,min, sum, avg
        System.out.println(product.collect(Collectors.summarizingInt(Product::price)));


    }
}
