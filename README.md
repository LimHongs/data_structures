# data_structures

# List :   
1. List 는 순서가 있는 컬렉션으로 중복된 요소를 허용가능
2. List<String> list = new ArrayList<>();

# ArrayList : 
1. List의 한 구현체로, 동적으로 크기가 조정되는 배열

arrayList.add("Apple");
arrayList.add("Banana");
System.out.println(arrayList.size()); // 2
System.out.println(arrayList.get(0)); // Apple
arrayList.remove("Banana");

# Map : 
1. 키 - 값 쌍으로 데이터 저장 키는 유일해야한다
Map<String, Integer> map = new HashMap<>();

# HashMap : 
1. Map의 한 구현체로 해시 테이블을 기반으로 키 - 값 쌍을 저장 
 
HashMap < String,Integer> hashMap = new HashMap<>();

hashMap.put("Alice", 30);
hashMap.put("Bob", 25);
System.out.println(hashMap.get("Alice")); // 30
System.out.println(hashMap.containsKey("Bob")); // true
hashMap.remove("Bob");

# Set: 
1.중복된 요소를 허용하지 않는 데이터 집합 
 
Set<String> set = new HashSet<>();

# HashSet:
1. set 의 한 구현체로 해시 테이블을 기반으로 중복되지 않는 요소를 저장 

HashSet<String> hashSet = new HashSet<>();

hashSet.add("Apple");
hashSet.add("Banana");
System.out.println(hashSet.size()); // 2
System.out.println(hashSet.contains("Apple")); // true
hashSet.remove("Banana");

