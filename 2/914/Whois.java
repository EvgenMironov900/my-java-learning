/*
 Демонстрaция использовaния клaссa Socket.
Нaзoвитe этoт фaйл 914 Whois.java
*/

import java.net.*;
import java.io.*;
class Whois {
  public static void main(String[] args ) throws Exception {
    int c;
    // Создaть сокет, подключенный к internic.net, порт 43.
    Socket s = new Socket( "whois.internic.net", 43) ;
    // Получить потоки вводa и выводa.
    InputStream in = s.getInputStream() ;
    OutputStream out = s.getOutputStream();
    // Сконструировaть строку зaпросa.
    String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n" ;
    // Преобрaзoвaть в бaйты.
    byte[] buf = str.getBytes();
    // Отпрaвить зaпрос.
    out.write(buf) ;
    // Прочитaть и отобрaзить ответ.
    while((c = in.read()) != -1 )
      System.out.print((char) c);
    s.close() ;
  }
}
/*
Рeзyльтaт paбoты пpoгpaммы:

   Domain Name: MHPROFESSIONAL.COM
   Registry Domain ID: 479181747_DOMAIN_COM-VRSN
   Registrar WHOIS Server: whois.corporatedomains.com
   Registrar URL: http://cscdbs.com
   Updated Date: 2024-06-05T05:13:49Z
   Creation Date: 2006-06-09T16:44:39Z
   Registry Expiry Date: 2025-06-09T16:44:39Z
   Registrar: CSC Corporate Domains, Inc.
   Registrar IANA ID: 299
   Registrar Abuse Contact Email: domainabuse@cscglobal.com
   Registrar Abuse Contact Phone: 8887802723
   Domain Status: clientTransferProhibited https://icann.org/epp#clientTransferProhibited
   Name Server: PDNS85.ULTRADNS.BIZ
   Name Server: PDNS85.ULTRADNS.COM
   Name Server: PDNS85.ULTRADNS.NET
   Name Server: PDNS85.ULTRADNS.ORG
   DNSSEC: unsigned
   URL of the ICANN Whois Inaccuracy Complaint Form: https://www.icann.org/wicf/
>>> Last update of whois database: 2025-03-14T14:48:58Z <<<

For more information on Whois status codes, please visit https://icann.org/epp

NOTICE: The expiration date displayed in this record is the date the
registrar's sponsorship of the domain name registration in the registry is
currently set to expire. This date does not necessarily reflect the expiration
date of the domain name registrant's agreement with the sponsoring
registrar.  Users may consult the sponsoring registrar's Whois database to
view the registrar's reported date of expiration for this registration.

TERMS OF USE: You are not authorized to access or query our Whois
database through the use of electronic processes that are high-volume and
automated except as reasonably necessary to register domain names or
modify existing registrations; the Data in VeriSign Global Registry
Services' ("VeriSign") Whois database is provided by VeriSign for
information purposes only, and to assist persons in obtaining information
about or related to a domain name registration record. VeriSign does not
guarantee its accuracy. By submitting a Whois query, you agree to abide
by the following terms of use: You agree that you may use this Data only
for lawful purposes and that under no circumstances will you use this Data
to: (1) allow, enable, or otherwise support the transmission of mass
unsolicited, commercial advertising or solicitations via e-mail, telephone,
or facsimile; or (2) enable high volume, automated, electronic processes
that apply to VeriSign (or its computer systems). The compilation,
repackaging, dissemination or other use of this Data is expressly
prohibited without the prior written consent of VeriSign. You agree not to
use electronic processes that are automated and high-volume to access or
query the Whois database except as reasonably necessary to register
domain names or modify existing registrations. VeriSign reserves the right
to restrict your access to the Whois database in its sole discretion to ensure
operational stability.  VeriSign may restrict or terminate your access to the
Whois database for failure to abide by these terms of use. VeriSign
reserves the right to modify these terms at any time.

The Registry database contains ONLY .COM, .NET, .EDU domains and
Registrars.
*/

