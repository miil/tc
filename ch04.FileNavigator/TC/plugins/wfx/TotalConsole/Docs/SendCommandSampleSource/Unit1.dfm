object Form1: TForm1
  Left = 218
  Top = 142
  BorderIcons = [biSystemMenu]
  BorderStyle = bsSingle
  Caption = 'Send command  to all TotalConsole'
  ClientHeight = 269
  ClientWidth = 277
  Color = clBtnFace
  Font.Charset = DEFAULT_CHARSET
  Font.Color = clWindowText
  Font.Height = -11
  Font.Name = 'MS Sans Serif'
  Font.Style = []
  OldCreateOrder = False
  PixelsPerInch = 96
  TextHeight = 13
  object edt1: TEdit
    Left = 8
    Top = 240
    Width = 49
    Height = 21
    TabOrder = 0
    Text = '0'
    OnKeyPress = edt1KeyPress
  end
  object btn1: TButton
    Left = 192
    Top = 240
    Width = 75
    Height = 25
    Caption = 'Exec'
    Default = True
    TabOrder = 1
    OnClick = btn1Click
  end
  object ListBox1: TListBox
    Left = 0
    Top = 0
    Width = 277
    Height = 225
    Align = alTop
    ItemHeight = 13
    Items.Strings = (
      '0=NextTab'
      '1=PrevTab'
      '2=CloseAll'
      '3=CloseActive'
      '4=Minimize'
      '5=Hide'
      '6=Show'
      '7=Options'
      '8=SetTCFocus'
      '9=SetConsoleFocus'
      '10=ExchangeFocus'
      '11=NewConsole'
      '12=Ctrl+O Imitation')
    TabOrder = 2
    OnClick = ListBox1Click
    OnKeyPress = ListBox1KeyPress
  end
end
