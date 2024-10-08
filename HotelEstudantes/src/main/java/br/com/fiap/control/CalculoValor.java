package br.com.fiap.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalculoValor")
public class CalculoValor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public CalculoValor() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out = response.getWriter();
	
	//out.println("oi servlet");
	
	String nome = request.getParameter("nome");
	int dias = Integer.parseInt(request.getParameter("dias"));
	double valorTotal=0;
	
	
	for(int i=dias; i > 0; i--) {
		valorTotal += (350/i);
	}
	
	System.out.println("Nome: " + nome);
	System.out.println("Valor total: R$" + valorTotal);
	System.out.println("Quantidade de dias: " + dias);
	
	/*System.out.println("oi");
	System.out.println(valorTotal);
	System.out.println(dias);*/
	
	//setar atributos
	request.setAttribute("nome", nome);
	request.setAttribute("valorTotal", valorTotal);
	request.setAttribute("dias", dias);
	
	RequestDispatcher rd = request.getRequestDispatcher("resultado.jsp");
	rd.forward(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
