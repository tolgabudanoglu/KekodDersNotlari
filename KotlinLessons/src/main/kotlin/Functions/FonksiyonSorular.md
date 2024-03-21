<span style="color:red">1.</span> Topluluk fonksiyonları (Top-level functions) Kotlin'de nasıl tanımlanır ve kullanılır?
- Kotlin'de topluluk fonksiyonları, bir sınıf veya nesne içine yerleştirilmeden doğrudan dosya seviyesinde tanımlanan fonksiyonlardır. Bu fonksiyonlar, başka bir sınıfın bir parçası olmadan doğrudan dosya içinde kullanılabilirler. Topluluk fonksiyonları, Kotlin'deki işlevsel programlama paradigmasını desteklerken kodu daha düzenli hale getirmeye yardımcı olabilir.

<span style="color:red">2.</span> Kotlin'de yerel fonksiyonlar (Local functions) nedir ve nasıl tanımlanır?
- Kotlin'de yerel fonksiyonlar, başka bir fonksiyonun içinde tanımlanan ve sadece bu ana fonksiyon içinde erişilebilen fonksiyonlardır. 

<span style="color:red">3.</span> Kotlin'de üye fonksiyonlar (Member functions) nedir ve nasıl tanımlanır?
- Kotlin'de üye fonksiyonlar, bir sınıf veya bir nesne içinde tanımlanan ve bu sınıfın veya nesnenin bir parçası olarak kabul edilen fonksiyonlardır.

<span style="color:red">4.</span> Kotlin'de genişletilmiş fonksiyonlar (Extension functions) nedir ve nasıl tanımlanır?
- Kotlin'de genişletilmiş fonksiyonlar, mevcut bir sınıfın veya nesnenin davranışını değiştirmek veya genişletmek için kullanılan özel fonksiyonlardır. Bu fonksiyonlar, mevcut sınıf veya nesne türleri üzerine yazılabilir ve bu türler için yeni davranışlar eklemek için kullanılabilir. Genişletilmiş fonksiyonlar, var olan bir sınıfın veya arayüzün içine dahil edilmeden dışarıdan tanımlanabilir.

<span style="color:red">5.</span> Yüksek mertebeden fonksiyonlar (Higher-order functions) Kotlin'de nasıl tanımlanır ve kullanılır?
- Bir fonksiyonun içine parametre olarak bir fonksiyon verebiliyorsak ya da bir fonksiyonun geri dönüş tipini fonk olarak alabiliyorsak higher order fonk denir.
Geriye dönük bir haberleşme için ya da bir fonk call edildiği yere bilgi taşımak isteniyorsa bunlar kullanılır.

<span style="color:red">6.</span> Kotlin'de "infix" fonksiyonlar nedir ve nasıl tanımlanır?
- Bir fonksiyonun infix olabilmesi için 5 şart vardır :
  1 infix keywordu
  2 fonksiyon üye fonksion olmalıdır. (sınıfa ait olmalı)
  3 ya da extension fonk olmalıdır.
  4.sadece bir parametre almalıdır(vararg olamaz )
  5 parametresi default değer alamaz

7. 