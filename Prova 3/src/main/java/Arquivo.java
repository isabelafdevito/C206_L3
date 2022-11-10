import java.io.*;
import java.util.ArrayList;

public class Arquivo
{
    public void anotar(Compra compra)
    {
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        try
        {
            os = new FileOutputStream("Gado.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);


            bw.write("Compra");// Parametro de leitura
            bw.newLine();
            bw.write(compra.getId() + "\n");
            bw.write(compra.getPeso() + "\n");
            bw.write(compra.getRaca() + "\n");
            bw.write(compra.getPrecoVenda() + "\n");

        } catch (Exception e) {
            System.out.println(e);
        }
        finally
        {
            try {
                // tentar fechar a entrada dedados pra não enviar lixo
                bw.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public ArrayList<Compra> ler()
    {
        ArrayList<Compra> acheiNoArquivo = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        String linhaLer;


        try{

            is = new FileInputStream("Gado.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();
            while (linhaLer != null)
            {
                if (linhaLer.contains("Compra")) {
                    Compra aux = new Compra();
                    aux.setId(Integer.parseInt(br.readLine()));
                    aux.setPeso(Integer.parseInt(br.readLine()));
                    aux.setRaca(br.readLine());
                    aux.setPrecoVenda(Float.parseFloat(br.readLine()));
                    acheiNoArquivo.add(aux);

                }
            }

        }catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            try
            {
                br.close();
            }catch (Exception e)
            {
                System.out.println(e);
            }
        }

        return acheiNoArquivo;
    }

}
