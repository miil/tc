unit Unit1;

interface

uses
  Windows, Messages, SysUtils, Variants, Classes, Graphics, Controls, Forms,
  Dialogs, StdCtrls;

type
  TForm1 = class(TForm)
    edt1: TEdit;
    btn1: TButton;
    ListBox1: TListBox;
    procedure btn1Click(Sender: TObject);
    procedure ListBox1Click(Sender: TObject);
    procedure ListBox1KeyPress(Sender: TObject; var Key: Char);
    procedure edt1KeyPress(Sender: TObject; var Key: Char);
  private
    { Private declarations }
  public
    { Public declarations }
  end;
const
  WM_CALLBACKMESSAGE=wm_user+182;
var
  Form1: TForm1;

implementation


{$R *.dfm}

//List of all Total Commander main windows
///-----------------------------------------------------------------
Function GetTCWnd(WndList:TStrings):boolean;
var Main:THandle;
begin
 result:=false;
 Main:=FindWindow('TTOTAL_CMD',nil);
  if main=0 then exit;
 while Main<>0 do
  begin
   WndList.AddObject(inttostr(Main),nil));
   Main:=FindWindowEx(0,Main,'TTOTAL_CMD',nil);
  end;
 result:=true;
end;
///-----------------------------------------------------------------

procedure TForm1.btn1Click(Sender: TObject);
var strl:TStringList;
begin
    try
     strl:=TStringList.Create;
     GetTCWnd(strl);   //get list of TC main windows
     While strl.Count>0 do
     begin
      //send command index
      SendMessage(FindWindowEx(StrToInt(strl[0]),0,'TFKon','TotalConsoleMain'),WM_CALLBACKMESSAGE,StrToInt(edt1.Text),0);
      strl.Delete(0);
     end;

    finally
     strl.Free;
    end;

end;

procedure TForm1.ListBox1Click(Sender: TObject);
begin
edt1.Text:=ListBox1.Items.Names[ListBox1.ItemIndex];
end;

procedure TForm1.ListBox1KeyPress(Sender: TObject; var Key: Char);
begin
edt1.Text:=ListBox1.Items.Names[ListBox1.ItemIndex];
end;

procedure TForm1.edt1KeyPress(Sender: TObject; var Key: Char);
begin
if not (Key in ['0'..'9']) then  key:=#0;
end;

end.