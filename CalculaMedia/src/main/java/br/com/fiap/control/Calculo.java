package br.com.fiap.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.model.Aluno;


@WebServlet("/Calculo")

public class Calculo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Calculo() {
        super();
        
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome");
		double nota1 = Double.parseDouble(request.getParameter("nota1"));
		double nota2 = Double.parseDouble(request.getParameter("nota2"));
		
		Aluno aluno = new Aluno();
		aluno.setNota1(nota1);
		aluno.setNota2(nota2);
		aluno.setNome(nome);
		
		//calcular a média
		double media = ((nota1+nota2)/2);
		
		
		//ver se está aprovado
		//aluno.isAprovado(media);
					
		//setando
		
		request.setAttribute("media", media);
		request.setAttribute("nome", nome);
		request.setAttribute("situacao", aluno.verificaSituacao(media));

		
		out.println("ola mundo calculo");
		
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
