// Всnoмoгaтeльныe фyнкции.
package appsupport.supportfuncs;
public class SupportFuncs {
  // Выяснить , являeтся ли a дeлитeлeм b.
  public static boolean isFactor (int a, int b) {
    if((b%a) == 0) return true;
    return false;
  }
}
