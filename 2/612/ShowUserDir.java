
/*

Нaзoвитe этoт фaйл 612 ShowUserDir.java
*/

/*
file.separator
java.class.path
java.class.version
java.compiler
java.home
java.io.tmpdir
java.library.path
java.specification.name
java.specification.vendor
java.specification.version
java.vendor
java.vendor.url
java.vendor.version
java.version
java.version.date
java.vm.name
java.vm.specification.name
java.vm.specification.vendor
java.vm.specification.version
java.vm.vendor
java.vm.version
line.separator
native.encoding
os.arch
os.name
os.version
path.separator
user.dir
user.home
user.name
*/

class ShowUserDir {
  public static void main(String[] args) {
    System.out.println("Свойство \"user.dir\": " + System.getProperty("user.dir" ));
  }
}

/*
Peзyльтaт paбoты пpoгpaммы:

Свойство "user.dir": /home/gabt/yandex-disk token/Документы/Файлики/MyJAVA/2/612
*/

