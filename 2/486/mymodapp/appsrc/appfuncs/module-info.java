// Определение модуля математических функций, в котором используется конструкция to .
module appfuncs {
	// Экспортировать пакет appfuncs.simplefuncs в appstart.
	exports appfuncs.simplefuncs to appstart;
	// Зaтpeбoвaть мoдyль appsupport и сдeлaть eгo тpaнзитивным.
  requires transitive appsupport;

}
/*
cd ~/EE/MyJAVA/2/486/mymodapp
javac -d appmodules --module-source-path appsrc appsrc/appstart/appstart/mymodappdemo/MyModAppDemo.java

*/
